package epsi.archi.mvc.converter;

import epsi.archi.mvc.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ConverterController {

    private Model model;
    private ConverterView view;

    public ConverterController(Model aModel, ConverterView aConverterView) {
        model = aModel;
        view = aConverterView;
        bind();
    }

    public void bind() {
        view.getConvert().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean custom = view.getCustomToggle().isVisible();
                model.setAmount(Double.valueOf(view.getAmount().getText()));
                if(custom) {
                    view.toggleCustomAmount(true);
                }
                else {
                    view.toggleCustomAmount(false);
                }
                model.notifyObservers();
            }
        });
        view.getCustomToggle().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    view.toggleCustomPanel(true);
                }
                else {
                    view.toggleCustomPanel(false);
                }
            }
        });
    }
}
