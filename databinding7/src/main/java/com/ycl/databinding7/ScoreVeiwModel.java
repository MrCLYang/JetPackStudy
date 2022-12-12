package com.ycl.databinding7;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * 作者：ycl
 * 时间：2022/12/12
 * 描述：
 */
public class ScoreVeiwModel extends ViewModel {
    public MutableLiveData<Integer> ascore;
    public MutableLiveData<Integer> bscore;
    private int aLastScore;
    private int bLastScore;


    public MutableLiveData<Integer> getAscore() {
        if(ascore==null){
            ascore=new MutableLiveData<>();
            ascore.setValue(0);
        }
        return ascore;
    }

    public MutableLiveData<Integer> getBscore() {
        if(bscore==null){
            bscore=new MutableLiveData<>();
            bscore.setValue(0);
        }
        return bscore;
    }

    // a加分
    public void aplus(int score){
        saveScore();
        ascore.setValue(ascore.getValue()+score);
    }

    // b加分
    public void bplus(int score){
        saveScore();
        bscore.setValue(bscore.getValue()+score);
    }

   //重置分数
   public void restScore(){
        ascore.setValue(0);
        bscore.setValue(0);
   }

  public void saveScore(){
      aLastScore= ascore.getValue();
      bLastScore = bscore.getValue();
  }

  public void undo(){
        ascore.setValue(aLastScore);
        bscore.setValue(bLastScore);
  }

}
