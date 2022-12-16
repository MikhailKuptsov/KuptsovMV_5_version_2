public class PotentialEnergy {
    public final float g=(float)9.8;
    public float H;
    public float m;

    public PotentialEnergy(){}
    public PotentialEnergy(float h1,float m1){
        H=h1;
        m=m1;
    }
    public float get_H(){
        return H;
    }
    public float get_m(){
        return m;
    }
    public void set_m(float m){
        this.m=m;
    }
    public void set_H(float H){
        this.H=H;
    }
    public float get_potential_Energy(){
        return(m*H*g);
    }
}
