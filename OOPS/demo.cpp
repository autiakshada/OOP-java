#include<stdio.h>
#include<string.h>
#include<time.h>
#include <ctype.h>

/*

 Created by Shantanu Suryavanshi
 date-9-9-22

*/
// prototype function


/*

### you can add more latter but you need to write condition yourself


void name_Character()
{

    for(int i=1; i<=5; i++)
    {

      for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(condition)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

*/

void A_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if((j==1 && i>1) ||((i==1 ||i==4) && (j==2 || j==3 ||j==4))|| (j==5 &&i>1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void B_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==3||i==5)&&(j==1||j==2||j==3||j==4)) ||((i==2||i==4)&&(j==1||j==5)) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void C_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==2||j==3||j==4))  ||((i==2||i==4)&&(j==1)) ||(i==3 &&j==1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void D_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==1||j==2||j==3||j==4)) || ((i==2||i==3||i==4)&&(j==1||j==5)) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void E_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==3||i==5)&&(j==1||j==2||j==3||j==4||j==5)) || ((i==2||i==4)&&j==1) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void F_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==3)&&(j==1||j==2||j==3||j==4||j==5)) || ((i==2||i==4||i==5)&&j==1) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void G_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==2||j==3||j==4)) ||((i==3)&&(j==1||j==3||j==4||j==5)) || ((i==4)&&(j==1||j==4)) ||(i==2&&j==1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void H_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((j==1||j==5)&&(i==1||i==2||i==3||i==4||i==5))||((i==3&&(j==2||j==3||j==4)) ))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void I_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if((i==1||i==5) &&(j==1 ||j==2 ||j==3||j==4 ||j==5 ) ||(j==3&&(i==2||i==3||i==4))  )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
}

void J_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(  ((i==1) &&(j==1 ||j==2 ||j==4 ||j==5 )) ||(j==3&&(i==1||i==2||i==3||i==4))||( (i==4||i==5)&&(j==1||j==3) ) ||(i==5&&j==2 ) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
}


void K_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==1||j==4||j==5))  || ((i==2||i==4)&&(j==1||j==3)) || ((i==3)&&(j==1||j==2) ) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void L_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((j==1)&&(i==1||i==2||i==3||i==4||i==5)) || ((i==5)&&(j==2||j==3||j==4||j==5) ))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void M_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((j==1||j==5)&&(i==1||i==2||i==3||i==4||i==5))  ||((i==2)&&(j==2||j==4)) ||(i==3&&j==3))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void N_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((j==1||j==5)&&(i==1||i==2||i==3||i==4||i==5)) ||i==j)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void O_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==2||j==3||j==4)) || ((j==1||j==5)&&(i==2||i==3||i==4)))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void P_Character()
{
    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==3)&&(j==1||j==2||j==3||j==4)) || ((j==1)&&(i==2||i==4||i==5 )) ||(i==2&&j==5))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void Q_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==2||j==3||j==4)) || ((j==1||j==5)&&(i==2||i==3||i==4)) ||(i==j&&i>=3) )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void R_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==3) &&(j==1||j==2 ||j==3||j==4)) || (i==2 &&(j==1||j==5))||(i==4&& (j==1||j==3))||(i==5 &&(j==1||j==4) ))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void S_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==3||i==5)&&(j==1||j==2||j==3||j==4||j==5)) ||(i==2&&j==1)||(i==4&&j==5))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void T_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if((i==1) &&(j==1 ||j==2 ||j==3||j==4 ||j==5 ) ||(j==3&&(i==2||i==3||i==4||i==5))  )
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
}

void U_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==5)&&(j==2||j==3||j==4)) || ((j==1||j==5)&&(i==1||i==2||i==3||i==4)))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void V_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((j==1||j==5) && (i==1||i==2 ||i==3)) ||(i==4 &&(j==2||j==4)) || (i==5&&j==3))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void W_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((j==1||j==5)&&(i==1||i==2||i==3||i==4||i==5))  ||((i==4)&&(j==2||j==4)) ||(i==3&&j==3))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void X_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(i==j||(i==1&&j==5||i==2&&j==4||i==4&&j==2||i==5&&j==1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}

void Y_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if((i==j&&i<4)||(i==1&&j==5||i==2&&j==4||i==4&&j==3||i==5&&j==3))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void Z_Character()
{

    for(int i=1; i<=5; i++)
    {

        for(int j=1; j<=14; j++)
        {
            printf(" ");
        }
        for(int j=1; j<=5; j++)
        {
            if(((i==1||i==5)&&(j==1||j==2||j==3||j==4||j==5)) || (i==1&&j==5||i==2&&j==4||i==4&&j==2||i==5&&j==1||i==j&&j==3))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }


}


void callname(char teller)
{

    switch(teller)
    {

    case 'A':
        A_Character();
        printf("\n");
        break;

    case 'B':
        B_Character();
        printf("\n");
        break;

    case 'C':
        C_Character();
        printf("\n");
        break;

    case 'D':
        D_Character();
        printf("\n");
        break;

    case 'E':
        E_Character();
        printf("\n");
        break;

    case 'F':
        F_Character();
        printf("\n");
        break;

    case 'G':
        G_Character();
        printf("\n");
        break;

    case 'H':
        H_Character();
        printf("\n");
        break;

    case 'I':
        I_Character();
        printf("\n");
        break;

    case 'J':
        J_Character();
        printf("\n");
        break;

    case 'K':
        K_Character();
        printf("\n");
        break;

    case 'L':
        L_Character();
        printf("\n");
        break;

    case 'M':
        M_Character();
        printf("\n");
        break;

    case 'N':
        N_Character();
        printf("\n");
        break;

    case 'O':
        O_Character();
        printf("\n");
        break;

    case 'P':
        P_Character();
        printf("\n");
        break;

    case 'Q':
        Q_Character();
        printf("\n");
        break;

    case 'R':
        R_Character();
        printf("\n");
        break;

    case 'S':
        S_Character();
        printf("\n");
        break;

    case 'T':
        T_Character();
        printf("\n");
        break;

    case 'U':
        U_Character();
        printf("\n");
        break;

    case 'V':
        V_Character();
        printf("\n");
        break;

    case 'W':
        W_Character();
        printf("\n");
        break;

    case 'X':
        X_Character();
        printf("\n");
        break;

    case 'Y':
        Y_Character();
        printf("\n");
        break;

    case 'Z':
        Z_Character();
        printf("\n");
        break;

    default:
        ("wrong charectors!");
    }


}

void Heart(int n)
{
    if(n%2==0)
        n++;

    for(int i=0; i<n; i++)
    {
        for(int j=1; j<=11; j++)
        {
            printf(" ");
        }

        for(int j=0; j<n; j++)
        {
            if(i==0&&(j>=n/5&&j<=n/2-n/5)||i==0&&(j>=n/2+n/5&&j<=(n-1)-n/5))
                printf("*");
            else if(i>0&&i<=n/5&&(j==n/5-i||j==n/2+n/5-i||j==n/2-n/5+i||j==(n-1)-n/5+i))
                printf("*");
            else if((i>n/5&&i<=n/2)&&(j==0||j==n-1))
                printf("*");
            else if(i>n/2&&(j==i-n/2||j==(n-1)-(i-n/2)))
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }


}


void nameIdentifer(char name1[20],char name2[20],int y)
{
    struct tm* ptr;
    time_t t;

    t = time(NULL);

    ptr = localtime(&t);




    printf("\n\n");
    printf("-----------------------------------");
    printf("\n");
    if(y==1)
    {
        printf("   > %s Loves %s <\n",name1,name2);
        printf("\n      Today is:%s", asctime(ptr));
    }
    else
    {
        printf("   > %s And %s <\n",name1,name2);
        printf("\n Today is:%s", asctime(ptr));
    }

    printf("-----------------------------------");
    printf("\n\n");




    for(int j=0; j<=strlen(name1); j++)
    {

        for ( char c = 'A'; c <= 'Z'; ++c)
        {

            char z= toupper(name1[j]);
            if(z==c)
            {
                callname(c);

                printf("\n");
            }


        }

    }

    printf("\n");
    if(y==1)
    {
        Heart(10);
    }
    else
    {

        printf("\n     -----:Is a Friend of :----- \n");
    }

    printf("\n\n");

    for(int j=0; j<=strlen(name2); j++)
    {

        for ( char c = 'A'; c <= 'Z'; ++c)
        {
            char Z=toupper(name2[j]);
            if(Z==c)
            {
                callname(c);

                printf("\n");
            }


        }

    }



}






int main()
{


    char name1[20];
    char name2[20];
    int y;


    clock_t start_t,end_t;


    printf("\n--:Enter your name:--\n");
    gets(name1);


    printf("\n--:Enter your friend name:--\n");
    gets(name2);


    printf("\n--:relationship with your friend:--");
    printf("\n press=1(Love) || press=0(Friend)\n");
    scanf("\n%d",&y);




    start_t=clock();

    nameIdentifer(name1,name2,y);
    end_t=clock();
    double total_t = (double )(end_t - start_t) / CLOCKS_PER_SEC;

    printf("-----------------------------------");

    printf("  \n CPU time : %f sec\n", total_t  );

    printf("-----------------------------------");

    return 0;
}
