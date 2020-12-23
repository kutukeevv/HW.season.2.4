package com.company;

public class Runner extends Thread {
    private Runner nextRunner;

    public Runner(String name, Runner nextRunner){
        super(name);
        this.nextRunner = nextRunner;
    }

    public Runner(String name){
        super(name);

    }

    public void run(){
        try{
            System.out.println(this.getName()+" берёт палочку");
            if(nextRunner == null){
                System.out.println(this.getName()+" бежит к финишу");
            }else{
                System.out.println(this.getName() + " бежит к " + nextRunner.getName());
            }
            sleep(2000);
            if(nextRunner != null){
                nextRunner.start();
                nextRunner.join();
                System.out.println(nextRunner.getName()+" берет палочку");
                System.out.println(nextRunner.getName()+" бежит к" + this.getName());
            }
            sleep(1000);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
