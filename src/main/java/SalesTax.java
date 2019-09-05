
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jfortney
 */
public class SalesTax {

    public static void main(String[] args) {

        String purchaseAmount = JOptionPane.showInputDialog("Please input purchase amount");

        System.out.println("The purchase amount is $" + purchaseAmount);

        double stateSalesTax = 0.04;

        stateSalesTax = stateSalesTax * Double.parseDouble(purchaseAmount);

        System.out.println("The state sales tax is $" + stateSalesTax);

        double countySalesTax = 0.02;

        countySalesTax = countySalesTax * Double.parseDouble(purchaseAmount);
        System.out.println("The county sales tax is $" + countySalesTax);

        double totalSalesTax = stateSalesTax + countySalesTax;
        System.out.println("The total sales tax is $" + new Float(totalSalesTax));

        double totalSale = totalSalesTax + Double.parseDouble(purchaseAmount);
        System.out.println("The total sale is equal to $" + new Float(totalSale));

    }
}
