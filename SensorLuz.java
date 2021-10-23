public class SensorLuz
{
    private int intensidadMin;
    private int intensidadMax;
    private int intensidad;

    public SensorLuz(int min, int max){
        this.intensidadMin = min;
        this.intensidadMax = max;
        this.intensidad = min;
    }

    public int getIntensidad(){
        return this.intensidad;

    }

    public void setIntensidad(int i){
        if (i>=this.intensidadMin && i<=this.intensidadMax){
            this.intensidad = i;
        }
    }

    public int duplicarIntensidad(){
        if (this.intensidad*2<=this.intensidadMax){
            this.intensidad= this.intensidad*2;           
        }
        return this.intensidad;
    }
}
