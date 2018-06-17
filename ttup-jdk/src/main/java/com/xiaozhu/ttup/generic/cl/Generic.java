package com.xiaozhu.ttup.generic.cl;

//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
// 泛型类
//https://blog.csdn.net/s10461/article/details/53941091
public class Generic<T>{
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public static void main(String args[]){
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

        //传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");


        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);

//        print("泛型测试","key is " + genericInteger.getKey());
//        print("泛型测试","key is " + genericString.getKey());

        print(genericString.getKey());

        print(genericInteger.getKey());

        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        showKeyValue(gNumber);
        showKeyValue(gInteger);
    }

    public <T> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
        T test = container.getKey();
        return test;
    }

    public static void showKeyValue(Generic<?> obj){
        print("key value is " + obj.getKey());
    }

    static void print(Object str){
        System.out.println(str);
    }


    public void showKeyValue1(Generic<? extends Number> obj){
        print("泛型测试"+"key value is " + obj.getKey());
    }
}