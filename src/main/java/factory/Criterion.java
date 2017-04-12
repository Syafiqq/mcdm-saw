package factory;

/*
 * This <saw> project in package <factory> created by : 
 * Name         : syafiq
 * Date / Time  : 09 April 2017, 6:59 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public abstract class Criterion
{
    public abstract void searchProfit(Profit criterion);

    public abstract void calculateNormalization(Profit criterion);

    public abstract void calculateWeightedNormalization(Weight criterion);
}
