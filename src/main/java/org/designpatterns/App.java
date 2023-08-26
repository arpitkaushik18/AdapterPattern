package org.designpatterns;

import org.designpatterns.adaptee.WeightMachineForBabies;
import org.designpatterns.adaptor.WeightMachineAdapter;
import org.designpatterns.adaptor.WeightMachineAdapterImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
