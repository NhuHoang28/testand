package com.example.hello;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class ListViewModel extends ViewModel {
    private MutableLiveData<ArrayList<String>> list;
    public LiveData<ArrayList<String>> getListNumber(){
        if(list==null){
            list=new MutableLiveData<ArrayList<String>>();
            ArrayList<String> arr = new ArrayList<>();
            arr.add("0");
            list.setValue(arr);
        }
        return list;
    }
    public void addlist(String a){
        ArrayList<String> temp = new ArrayList<>();
        temp = list.getValue();
        temp.add("" + a);
        list.setValue(temp);
    }
    public void changeList(int i, String num){
        ArrayList<String> temp = new ArrayList<>();
        temp = list.getValue();
        temp.set(i, num);
        list.setValue(temp);
    }
}