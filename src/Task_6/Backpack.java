package Task_6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Item> bestItems =null;  //лучший набор предметов для рюкзака
    private double maxW;                //общая масса рюкзака
    private double bestPrice;           // максимальная(лучшая) стоимость предметов лучшего набора

    public Backpack(double maxW) {
        this.maxW = maxW;
    }

    // создание всех возможных наборов вещей. Метод рекурсивный
    public  void MakeAllSets (List<Item> items){
        if (items.size()>0)
            CheckSet(items);

        for (int i=0; i<items.size(); i++){
            List<Item> newList= new ArrayList<>(items);
            newList.remove(i);
            MakeAllSets(newList);
        }
    }
    //общий вес набора предметов
    private double CalcWeight(List<Item> items)
    {
        double sumW=0;
        for (Item i : items){
            sumW+=i.weight;
        }
        return sumW;
    }
     //общая стоимость набора предметов
    private double CalcPrice (List<Item> items)
    {
        double sumPrice =0;
        for(Item i :items){
            sumPrice+=i.price;
        }
       return sumPrice;
    }
    //проверка, является ли данный набор лучшим решением задачи
    private  void CheckSet(List<Item> items)
    {
        if (bestItems==null){
            if (CalcWeight(items)<=maxW){
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
        else {
            if ((CalcWeight(items)<=maxW && CalcPrice(items)>bestPrice)){
                bestItems=items;
                bestPrice=CalcPrice(items);
            }
        }
    }
    public List<Item> getBestSet(){
         return bestItems;
    }
}

