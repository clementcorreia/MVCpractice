package epsi.archi.mvc.rate;

import epsi.archi.mvc.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RateController {

    private Model model;
    private RateView view;

    public RateController(Model aModel, RateView aRateView) {
        model = aModel;
        view = aRateView;
        bind();
    }

    public void bind() {
        view.getChangeRate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.save(model);
            }
        });
    }

}