/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author Николай
 */
class SimpleCalc{
    private final double a;
    private final double b;
    
    SimpleCalc(double p1,double p2){
        this.a=p1;
        this.b=p2;
    }
    public double getSum(){
        return this.a +this.b;
    }
    public double getDiv(){
        return this.a -this.b;
    }
   
    public double getMult(){
        return this.a *this.b;
    }
    public double getDel(){
        return this.a /this.b;
    }
}
