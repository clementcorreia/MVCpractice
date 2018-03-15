package epsi.archi.mvc.util;

import java.awt.*;

public class GridBagContraintsUtil {

    public static GridBagConstraints gridBagConstraints(int gridx, int gridy, double weightx, double weigthy, int fill, int anchor) {
        GridBagConstraints constraint =  new GridBagConstraints();
        constraint.gridx = gridx;
        constraint.gridy = gridy;
        constraint.weightx = weightx;
        constraint.weighty = weigthy;
        constraint.fill = fill;
        constraint.anchor = anchor;
        return constraint;
    }

    public static GridBagConstraints gridBagConstraints(int gridx, int gridy, double weightx, double weigthy, int fill) {
        return gridBagConstraints(gridx, gridy, weightx, weigthy, fill, GridBagConstraints.WEST);
    }

    public static GridBagConstraints gridBagConstraints(int gridx, int gridy, double weightx, double weigthy) {
        return gridBagConstraints(gridx, gridy, weightx, weigthy, GridBagConstraints.NONE);
    }
}
