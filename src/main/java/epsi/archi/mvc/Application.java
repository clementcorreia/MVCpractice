package epsi.archi.mvc;

import epsi.archi.mvc.converter.ConverterView;
import epsi.archi.mvc.rate.RateView;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        Model model = new Model();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConverterView(model);
                new RateView(model);
            }
        });
    }
}
