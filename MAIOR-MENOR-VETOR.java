#include <stdio.h>

int main()
{
    int elemento[10], i, maior, menor;
    
    for(i=0;i<10;i++){
        printf("elemento [%d}=",i);
        scanf("%d",&elemento[i]);

    }
    
     maior=elemento[0];
     menor=elemento[0];

     for(i=0;i<10;i++){
        if(elemento[i]>maior){
            maior=elemento[i];

     }
      if(elemento[i]<menor){
            menor=elemento[i];

        }
     }

     printf("O maior numero é:%d",maior);
     printf("\nO menor numero é:%d",menor); 


    return 0;
}
