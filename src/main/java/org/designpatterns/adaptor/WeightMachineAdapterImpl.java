package org.designpatterns.adaptor;

import org.designpatterns.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    public Integer getWeightInKg() {
        Integer weightInPound = weightMachine.getWeightInPounds();
        return (int) (.45*weightInPound);

    }
}
