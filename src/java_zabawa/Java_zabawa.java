
package java_zabawa;

public class Java_zabawa {

 /*   double func1(double N1[], double N2[], double A1, double B1, double C1, int i) 
    { 
        return (N1[i]*A1 - N1[i]*N1[i]*B1 - N1[i]*N2[i]*C1); 
    }
    
    double func2(double N1[], double N2[], double A2, double B2, double C2, int i) 
    { 
        return (N2[i]*A2 - N2[i]*N2[i]*B2 - N1[i]*N2[i]*C2); 
    }*/
    
    
    void euler(double N1[], double N2[], double A1, double A2, double B1, double B2, double C1, double C2, double h) 
    { 
        for(int i=1; i<1000; i++){
            N1[i] = N1[i-1] + (N1[i-1]*A1 - N1[i-1]*N1[i-1]*B1 - N1[i-1]*N2[i-1]*C1)*h; 
            
        }
        
        
        for(int i=1; i<1000; i++){
            N2[i] = N2[i-1] + (N2[i-1]*A2 - N2[i-1]*N2[i-1]*B2 - N1[i-1]*N2[i-1]*C2)*h;     
        }
        
    }
    
    public static void main(String[] args) {
        
        Java_zabawa obj = new Java_zabawa();
        
        double N1[] = new double[1000];
        double N2[] = new double[1000];
        double A1;
        double A2;
        double B1;
        double B2;
        double C1;
        double C2;
        double h = 0.1;
        
        
        N1[0] = 100000;
        N2[0] = 100000;
        A1 = A2 = 0.1;
        B1 = B2 = 0.0000008;
        C1 = 0.000001;
        C2 = 0.0000001;
        
        obj.euler(N1, N2, A1, A2, B1, B2, C1, C2, h);
        
        System.out.println(N1[100]);       
    }
}
    
