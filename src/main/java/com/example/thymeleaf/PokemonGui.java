package com.example.thymeleaf;

import com.example.thymeleaf.model.Datum;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.router.Route;

@Route("/pokemonVad")
public class PokemonGui extends VerticalLayout {
    PokemonClient pokemonClient = new PokemonClient();
    Datum datum;
    Image imageImg;
    Label labelFlavor;
    Label labelAttack;
    IntegerField integerField;
    Button buttonOnRead;
    public PokemonGui(){
        datum = new Datum();
        ComboBox<PokeNames> comboBoxName = new ComboBox<>("Name :", PokeNames.values());
        Button button = new Button("Search", new Icon(VaadinIcon.SEARCH));
        button.addClickListener(event -> {
            datum = pokemonClient.getOnePokemon(comboBoxName.getValue().toString(), 0);
            buttonOnRead = new Button("Search again", new Icon(VaadinIcon.SEARCH));
            buttonOnRead.addClickListener(eventSecond -> {
                datum = pokemonClient.getOnePokemon(comboBoxName.getValue().toString(), integerField.getValue() - 1);
                imageImg = new Image(datum.getImages().getSmall(), "there's no pokemon");
                labelFlavor = new Label(datum.getFlavorText());
                labelAttack =  new Label(datum.getAttacks().get(0).getText());
                add(imageImg, labelFlavor, labelAttack);
            });
            String pageSize = String.valueOf(pokemonClient.getPokemon(comboBoxName.getValue().toString()).size());
            imageImg = new Image(datum.getImages().getSmall(), "there's no pokemon");
            labelFlavor = new Label(datum.getFlavorText());
            labelAttack =  new Label(datum.getAttacks().get(0).getText());
            integerField = new IntegerField(String.format("Number of cards : %s",pageSize), pageSize);
            add(integerField, buttonOnRead, imageImg, labelFlavor, labelAttack);
        });
        add(comboBoxName, button);
    }
}
