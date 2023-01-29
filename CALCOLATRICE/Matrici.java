import java.util.*;

public class Matrici
{
    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();

    /////////////////////////

    private int dim1;
    private int dim2;
    private float matrix[][] = new float[dim1][dim2];
    private float noti[] = new float[dim1];


    public Matrici(int dim1 , int dim2)
    {
        setDim1(dim1);
        setDim2(dim2);

        /*inserimento matrice */

        setMatrix(dim1,dim2,matrix[dim1][dim2]);
    }

    public int getMatrix()
    {
        return this.matrix;
    }

    public void setDim1(int dim1)
    {
        this.dim1=dim1;
    }

    public void setDim2(int dim2)
    {
        this.dim2=dim2;
    }

    public void setMatrix(int dim1, int dim2 , float matrix[dim1][dim2])
    {
        for(int i=0;i<dim1;i++)
        {
            for(int j=0;j<dim2;j++)
            {
                System.out.println("inserire elemento "+" "+i+" "+j);

                matrix[i][j]= in;
            }
        }

        System.out.println("inserimento completato");
    }

    /*************************************** */

    public int Determinante()
    {
        float coefficenti[][]= new float[dim1][dim2];

        if(dim1==1 && dim2==1)
        {
            return matrix[1][1];
        }
        else if((dim1>1 || dim1<=3) && (dim2>1 || dim2<=3))
        {
            float determinante = gauss_algoritm(dim1 , dim2 , matrix[dim1][dim2] , noti[dm1]);


        }
    }

    public double gauss_algoritm(int dim1,int dim2,float matrix[dim1][dim2],float noti[dim1])
    {
        for(int k=0 ;k<dim1-1;k++)
        {
            for(int i=k+1;i<dim1;i++)
            {
                coefficenti[i][k]=matrix[i][k]/matrix[k][k];

                for(int j=k+1;j<n;j++)
                {
                    matrix[i][j]=matrix[i][j]-(matrix[k][j]*coefficenti[i][k]);
                }

                noti[i]=noti[i]-(noti[k]*coefficenti[i][k]);
            }
        }

        float determinante=0;

        for(int z=0;z<=dim1;z++)
        {
            determinante += matrix[z][z];
        }

        return determinante;
    }
}