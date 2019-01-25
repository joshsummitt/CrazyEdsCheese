package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        do
        {
            System.out.println("Please enter the diameter of cheese you would like to order 1)1 inch   2)2 inch   3)3 inch: ");
            int cheeseSize = scanner.nextInt();

            System.out.println("Please enter the amount of cheese you would like to order: ");
            int cheeseAmount = scanner.nextInt();

            System.out.println("The subtotal for your order is $" + calculateOrder(cheeseSize, cheeseAmount));
        }while(true);
    }

    private static int calculateOrder(int size, int amount)
    {
        return cheeseCost(size, amount) + shippingCost(size, amount);
    }

    private static int cheeseCost(int cheeseSize, int cheeseAmount)
    {
        int cost;
        if (cheeseSize == 1)
        {
            cost = cheeseAmount * 2;
        }
        else if (cheeseSize == 2)
        {
            cost = cheeseAmount * 4;
        }
        else
        {
            cost = cheeseAmount * 6;
        }
        System.out.println("The cost of your cheese is $" + cost);
        return cost;
    }

    private static int shippingCost(int cheeseSize, int cheeseAmount)
    {
        int shippingCost;
        if ((cheeseSize == 1 && cheeseAmount > 50) || (cheeseSize == 2 && cheeseAmount > 75) || (cheeseSize == 3 && cheeseAmount > 25))
        {
            shippingCost = 0;
        }
        else if (cheeseSize == 1 || cheeseSize == 2)
        {
            shippingCost = cheeseAmount * 2;
        }
        else
        {
            shippingCost = cheeseAmount * 4;
        }
        System.out.println("The shipping cost of your order is $" + shippingCost);
        return shippingCost;

    }
}
