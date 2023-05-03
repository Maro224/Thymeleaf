package com.example.thymeleaf;

import com.example.thymeleaf.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Controller
public class PokemonController {
    PokemonClient pokemonclient;
//    String s = "ABOMASNOW , ABRA , ABSOL , ACCELGOR , AEGISLASH , AERODACTYL , AGGRON , AIPOM , ALAKAZAM , ALCREMIE , ALOMOMOLA , ALTARIA , AMAURA , AMBIPOM , AMOONGUSS , AMPHAROS , ANORITH , APPLETUN , APPLIN , ARAQUANID , ARBOK , ARCANINE , ARCEUS , ARCHEN , ARCHEOPS , ARCTOVISH , ARCTOZOLT , ARIADOS , ARMALDO , AROMATISSE , ARON , ARROKUDA , ARTICUNO , AUDINO , AURORUS , AVALUGG , AXEW , AZELF , AZUMARILL , AZURILL , BAGON , BALTOY , BANETTE , BARBARACLE , BARBOACH , BARRASKEWDA , BASCULIN , BASTIODON , BAYLEEF , BEARTIC , BEAUTIFLY , BEEDRILL , BEHEEYEM , BELDUM , BELLOSSOM , BELLSPROUT , BERGMITE , BEWEAR , BIBAREL , BIDOOF , BINACLE , BISHARP , BLACEPHALON , BLASTOISE , BLAZIKEN , BLIPBUG , BLISSEY , BLITZLE , BOLDORE , BOLTUND , BONSLY , BOUFFALANT , BOUNSWEET , BRAIXEN , BRAVIARY , BRELOOM , BRIONNE , BRONZONG , BRONZOR , BRUXISH , BUDEW , BUIZEL , BULBASAUR , BUNEARY , BUNNELBY , BURMY , BUTTERFREE , BUZZWOLE , CACNEA , CACTURNE , CALYREX , CAMERUPT , CARBINK , CARKOL , CARNIVINE , CARRACOSTA , CARVANHA , CASCOON , CASTFORM , CATERPIE , CELEBI , CELESTEELA , CENTISKORCH , CHANDELURE , CHANSEY , CHARIZARD , CHARJABUG , CHARMANDER , CHARMELEON , CHATOT , CHERRIM , CHERUBI , CHESNAUGHT , CHESPIN , CHEWTLE , CHIKORITA , CHIMCHAR , CHIMECHO , CHINCHOU , CHINGLING , CINCCINO , CINDERACE , CLAMPERL , CLAUNCHER , CLAWITZER , CLAYDOL , CLEFABLE , CLEFAIRY , CLEFFA , CLOBBOPUS , CLOYSTER , COALOSSAL , COBALION , COFAGRIGUS , COMBEE , COMBUSKEN , COMFEY , CONKELDURR , COPPERAJAH , CORPHISH , CORSOLA , CORVIKNIGHT , CORVISQUIRE , COSMOEM , COSMOG , COTTONEE , CRABOMINABLE , CRABRAWLER , CRADILY , CRAMORANT , CRANIDOS , CRAWDAUNT , CRESSELIA , CROAGUNK , CROBAT , CROCONAW , CRUSTLE , CRYOGONAL , CUBCHOO , CUBONE , CUFANT , CURSOLA , CUTIEFLY , CYNDAQUIL , DARKRAI , DARMANITAN , DARTRIX , DARUMAKA , DECIDUEYE , DEDENNE , DEERLING , DEINO , DELCATTY , DELIBIRD , DELPHOX , DEOXYS , DEWGONG , DEWOTT , DEWPIDER , DHELMISE , DIALGA , DIANCIE , DIGGERSBY , DIGLETT , DITTO , DODRIO , DODUO , DONPHAN , DOTTLER , DOUBLADE , DRACOVISH , DRACOZOLT , DRAGALGE , DRAGAPULT , DRAGONAIR , DRAGONITE , DRAKLOAK , DRAMPA , DRAPION , DRATINI , DREDNAW , DREEPY , DRIFBLIM , DRIFLOON , DRILBUR , DRIZZILE , DROWZEE , DRUDDIGON , DUBWOOL , DUCKLETT , DUGTRIO , DUNSPARCE , DUOSION , DURALUDON , DURANT , DUSCLOPS , DUSKNOIR , DUSKULL , DUSTOX , DWEBBLE , EELEKTRIK , EELEKTROSS , EEVEE , EISCUE , EKANS , ELDEGOSS , ELECTABUZZ , ELECTIVIRE , ELECTRIKE , ELECTRODE , ELEKID , ELGYEM , EMBOAR , EMOLGA , EMPOLEON , ENTEI , ESCAVALIER , ESPEON , ESPURR , ETERNATUS , EXCADRILL , EXEGGCUTE , EXEGGUTOR , EXPLOUD , FALINKS , FARFETCH, FEAROW , FEEBAS , FENNEKIN , FERALIGATR , FERROSEED , FERROTHORN , FINNEON , FLAAFFY , FLABEBE, FLAPPLE , FLAREON , FLETCHINDER , FLETCHLING , FLOATZEL , FLOETTE , FLORGES , FLYGON , FOMANTIS , FOONGUS , FORRETRESS , FRAXURE , FRILLISH , FROAKIE , FROGADIER , FROSLASS , FROSMOTH , FURFROU , FURRET , GABITE , GALLADE , GALVANTULA , GARBODOR , GARCHOMP , GARDEVOIR , GASTLY , GASTRODON , GENESECT , GENGAR , GEODUDE , GIBLE , GIGALITH , GIRAFARIG , GIRATINA , GLACEON , GLALIE , GLAMEOW , GLASTRIER , GLIGAR , GLISCOR , GLOOM , GOGOAT , GOLBAT , GOLDEEN , GOLDUCK , GOLEM , GOLETT , GOLISOPOD , GOLURK , GOODRA , GOOMY , GOREBYSS , GOSSIFLEUR , GOTHITA , GOTHITELLE , GOTHORITA , GOURGEIST , GRANBULL , GRAPPLOCT , GRAVELER , GREEDENT , GRENINJA , GRIMER , GRIMMSNARL , GROOKEY , GROTLE , GROUDON , GROVYLE , GROWLITHE , GRUBBIN , GRUMPIG , GULPIN , GUMSHOOS , GURDURR , GUZZLORD , GYARADOS , HAKAMO , HAPPINY , HARIYAMA , HATENNA , HATTERENE , HATTREM , HAUNTER , HAWLUCHA , HAXORUS , HEATMOR , HEATRAN , HELIOLISK , HELIOPTILE , HERACROSS , HERDIER , HIPPOPOTAS , HIPPOWDON , HITMONCHAN , HITMONLEE , HITMONTOP , HONCHKROW , HONEDGE , HOOPA , HOOTHOOT , HOPPIP , HORSEA , HOUNDOOM , HOUNDOUR , HUNTAIL , HYDREIGON , HYPNO , IGGLYBUFF , ILLUMISE , IMPIDIMP , INCINEROAR , INDEEDEE , INFERNAPE , INKAY , INTELEON , IVYSAUR , JANGMO , JELLICENT , JIGGLYPUFF , JIRACHI , JOLTEON , JOLTIK , JUMPLUFF , JYNX , KABUTO , KABUTOPS , KADABRA , KAKUNA , KANGASKHAN , KARRABLAST , KARTANA , KECLEON , KELDEO , KINGDRA , KINGLER , KIRLIA , KLANG , KLEFKI , KLINK , KLINKLANG , KOFFING , KOMALA , KOMMO , KRABBY , KRICKETOT , KRICKETUNE , KROKOROK , KROOKODILE , KUBFU , KYOGRE , KYUREM , LAIRON , LAMPENT , LANDORUS , LANTURN , LAPRAS , LARVESTA , LARVITAR , LATIAS , LATIOS , LEAFEON , LEAVANNY , LEDIAN , LEDYBA , LICKILICKY , LICKITUNG , LIEPARD , LILEEP , LILLIGANT , LILLIPUP , LINOONE , LITLEO , LITTEN , LITWICK , LOMBRE , LOPUNNY , LOTAD , LOUDRED , LUCARIO , LUDICOLO , LUGIA , LUMINEON , LUNALA , LUNATONE , LURANTIS , LUVDISC , LUXIO , LUXRAY , LYCANROC , MACHAMP , MACHOKE , MACHOP , MAGBY , MAGCARGO , MAGEARNA , MAGIKARP , MAGMAR , MAGMORTAR , MAGNEMITE , MAGNETON , MAGNEZONE , MAKUHITA , MALAMAR , MAMOSWINE , MANAPHY , MANDIBUZZ , MANECTRIC , MANKEY , MANTINE , MANTYKE , MARACTUS , MAREANIE , MAREEP , MARILL , MAROWAK , MARSHADOW , MARSHTOMP , MASQUERAIN , MAWILE , MEDICHAM , MEDITITE , MEGANIUM , MELMETAL , MELOETTA , MELTAN , MEOWSTIC , MEOWTH , MESPRIT , METAGROSS , METANG , METAPOD , MEW , MEWTWO , MIENFOO , MIENSHAO , MIGHTYENA , MILCERY , MILOTIC , MILTANK , MIME , MIMIKYU , MINCCINO , MINIOR , MINUN , MISDREAVUS , MISMAGIUS , MOLTRES , MONFERNO , MORELULL , MORGREM , MORPEKO , MOTHIM , RIME , MUDBRAY , MUDKIP , MUDSDALE , MUK , MUNCHLAX , MUNNA , MURKROW , MUSHARNA , NAGANADEL , NATU , NECROZMA , NICKIT , NIDOKING , NIDOQUEEN , NIDORAN , NIDORINA , NIDORINO , NIHILEGO , NINCADA , NINETALES , NINJASK , NOCTOWL , NOIBAT , NOIVERN , NOSEPASS , NUMEL , NUZLEAF , OBSTAGOON , OCTILLERY , ODDISH , OMANYTE , OMASTAR , ONIX , ORANGURU , ORBEETLE , ORICORIO , OSHAWOTT , PACHIRISU , PALKIA , PALOSSAND , PALPITOAD , PANCHAM , PANGORO , PANPOUR , PANSAGE , PANSEAR , PARAS , PARASECT , PASSIMIAN , PATRAT , PAWNIARD , PELIPPER , PERRSERKER , PERSIAN , PETILIL , PHANPY , PHANTUMP , PHEROMOSA , PHIONE , PICHU , PIDGEOT , PIDGEOTTO , PIDGEY , PIDOVE , PIGNITE , PIKACHU , PIKIPEK , PILOSWINE , PINCURCHIN , PINECO , PINSIR , PIPLUP , PLUSLE , POIPOLE , POLITOED , POLIWAG , POLIWHIRL , POLIWRATH , POLTEAGEIST , PONYTA , POOCHYENA , POPPLIO , PORYGON , PRIMARINA , PRIMEAPE , PRINPLUP , PROBOPASS , PSYDUCK , PUMPKABOO , PUPITAR , PURRLOIN , PURUGLY , PYROAR , PYUKUMUKU , QUAGSIRE , QUILAVA , QUILLADIN , QWILFISH , RABOOT , RAICHU , RAIKOU , RALTS , RAMPARDOS , RAPIDASH , RATICATE , RATTATA , RAYQUAZA , REGICE , REGIDRAGO , REGIELEKI , REGIGIGAS , REGIROCK , REGISTEEL , RELICANTH , REMORAID , RESHIRAM , REUNICLUS , RHYDON , RHYHORN , RHYPERIOR , RIBOMBEE , RILLABOOM , RIOLU , ROCKRUFF , ROGGENROLA , ROLYCOLY , ROOKIDEE , ROSELIA , ROSERADE , ROTOM , ROWLET , RUFFLET , RUNERIGUS , SABLEYE , SALAMENCE , SALANDIT , SALAZZLE , SAMUROTT , SANDACONDA , SANDILE , SANDSHREW , SANDSLASH , SANDYGAST , SAWK , SAWSBUCK , SCATTERBUG , SCEPTILE , SCIZOR , SCOLIPEDE , SCORBUNNY , SCRAFTY , SCRAGGY , SCYTHER , SEADRA , SEAKING , SEALEO , SEEDOT , SEEL , SEISMITOAD , SENTRET , SERPERIOR , SERVINE , SEVIPER , SEWADDLE , SHARPEDO , SHAYMIN , SHEDINJA , SHELGON , SHELLDER , SHELLOS , SHELMET , SHIELDON , SHIFTRY , SHIINOTIC , SHINX , SHROOMISH , SHUCKLE , SHUPPET , SIGILYPH , SILCOON , SILICOBRA , SILVALLY , SIMIPOUR , SIMISAGE , SIMISEAR , SINISTEA , SIRFETCH , SIZZLIPEDE , SKARMORY , SKIDDO , SKIPLOOM , SKITTY , SKORUPI , SKRELP , SKUNTANK , SKWOVET , SLAKING , SLAKOTH , SLIGGOO , SLOWBRO , SLOWKING , SLOWPOKE , SLUGMA , SLURPUFF , SMEARGLE , SMOOCHUM , SNEASEL , SNIVY , SNOM , SNORLAX , SNORUNT , SNOVER , SNUBBULL , SOBBLE , SOLGALEO , SOLOSIS , SOLROCK , SPEAROW , SPECTRIER , SPEWPA , SPHEAL , SPINARAK , SPINDA , SPIRITOMB , SPOINK , SPRITZEE , SQUIRTLE , STAKATAKA , STANTLER , STARAPTOR , STARAVIA , STARLY , STARMIE , STARYU , STEELIX , STEENEE , STONJOURNER , STOUTLAND , STUFFUL , STUNFISK , STUNKY , SUDOWOODO , SUICUNE , SUNFLORA , SUNKERN , SURSKIT , SWABLU , SWADLOON , SWALOT , SWAMPERT , SWANNA , SWELLOW , SWINUB , SWIRLIX , SWOOBAT , SYLVEON , TAILLOW , TALONFLAME , TANGELA , TANGROWTH , TAPU , BULU , FINI , KOKO , LELE , TAUROS , TEDDIURSA , TENTACOOL , TENTACRUEL , TEPIG , TERRAKION , THIEVUL , THROH , THUNDURUS , THWACKEY , TIMBURR , TIRTOUGA , TOGEDEMARU , TOGEKISS , TOGEPI , TOGETIC , TORCHIC , TORKOAL , TORNADUS , TORRACAT , TORTERRA , TOTODILE , TOUCANNON , TOXAPEX , TOXEL , TOXICROAK , TOXTRICITY , TRANQUILL , TRAPINCH , TREECKO , TREVENANT , TROPIUS , TRUBBISH , TRUMBEAK , TSAREENA , TURTONATOR , TURTWIG , TYMPOLE , TYNAMO , TYPHLOSION , TYRANITAR , TYRANTRUM , TYROGUE , TYRUNT , UMBREON , UNFEZANT , UNOWN , URSARING , URSHIFU , UXIE , VANILLISH , VANILLITE , VANILLUXE , VAPOREON , VENIPEDE , VENOMOTH , VENONAT , VENUSAUR , VESPIQUEN , VIBRAVA , VICTINI , VICTREEBEL , VIGOROTH , VIKAVOLT , VILEPLUME , VIRIZION , VIVILLON , VOLBEAT , VOLCANION , VOLCARONA , VOLTORB , VULLABY , VULPIX , WAILMER , WAILORD , WALREIN , WARTORTLE , WATCHOG , WEAVILE , WEEDLE , WEEPINBELL , WEEZING , WHIMSICOTT , WHIRLIPEDE , WHISCASH , WHISMUR , WIGGLYTUFF , WIMPOD , WINGULL , WISHIWASHI , WOBBUFFET , WOOBAT , WOOLOO , WOOPER , WORMADAM , WURMPLE , WYNAUT , XATU , XERNEAS , XURKITREE , YAMASK , YAMPER , YANMA , YANMEGA , YUNGOOS , YVELTAL , ZACIAN , ZAMAZENTA , ZANGOOSE , ZAPDOS , ZARUDE , ZEBSTRIKA , ZEKROM , ZERAORA , ZIGZAGOON , ZOROARK , ZORUA , ZUBAT , ZWEILOUS , ZYGARDE";
    List<PokeNames> list = new ArrayList<>(Arrays.asList(PokeNames.values()));
    List<String> result = list.stream()
            .map(x -> x.toString())
            .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())
            .collect(Collectors.toList());
    List<Datum> pokemonList = new ArrayList<>();

    @GetMapping("/pokemon")
    public String getPokemon(Model model) {
        model.addAttribute("pokemonList", pokemonList);
        model.addAttribute("options", result);
        return "pokegui";
    }
    @PostMapping("/search")
    public String searchPokemon(@RequestParam() String name){
        pokemonclient = new PokemonClient();
        Datum dat = pokemonclient.getOnePokemon(name, 1);
        System.out.println(dat);
        result.remove(name);
        pokemonList.add(dat);
//        return String.format("redirect:show/%s", name);
        return "redirect:pokemon";
    }

}
