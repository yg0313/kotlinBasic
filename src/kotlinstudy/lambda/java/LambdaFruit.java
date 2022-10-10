package kotlinstudy.lambda.java;

import kotlinstudy.lambda.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LambdaFruit {

    public static void main(String[] args) {
        List<Fruit> results = new ArrayList<>();

        LambdaFruit.filterFruits(results, new FruitFilter() {
            @Override
            public boolean isSelected(Fruit fruit) {
                return Arrays.asList("사과", "반나나").contains(fruit.getName()) && fruit.getPrice() > 5_000;
            }
        });
    }

    private List<Fruit> findApples(List<Fruit> fruits){
        List<Fruit> apples = new ArrayList<>();

        for(Fruit fruit : fruits){
            if (fruit.getName().equals("사과")){
                apples.add(fruit);
            }
        }

        return apples;
    }

    private List<Fruit> findBananas(List<Fruit> fruits){
        List<Fruit> bananas = new ArrayList<>();

        for(Fruit fruit : fruits){
            if (fruit.getName().equals("바나나")){
                bananas.add(fruit);
            }
        }

        return bananas;
    }

    //리팩토링 --> 중복코드 제거
    private List<Fruit> findFruitsWithName(List<Fruit> fruits, String name){
        List<Fruit> results = new ArrayList<>();

        for(Fruit fruit : fruits){
            if (fruit.getName().equals(name)){
                results.add(fruit);
            }
        }

        return results;
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, FruitFilter fruitFilter){
        List<Fruit> results = new ArrayList<>();

        for(Fruit fruit : fruits){
            if(fruitFilter.isSelected(fruit)){
                results.add(fruit);
            }
        }

        return results;
    }

}
