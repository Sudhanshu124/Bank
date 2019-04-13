#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
  char p[10],temp[5];
  int i,l,j,pt[10],tot,wt=0,pr[10],temp1,n;
  int w[15];
  float avg;
 printf("enter no of processes:");
 scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  printf("enter process%d name:");
 scanf("%s",&p[10]);
  printf("enter process time:");
 scanf("%d",&pt[i]);
  printf("enter priority:");
  scanf("%d",&pr[i]);
  }
 for(l=0;l<n-1;l++)
 {
 for(j=l+1;j<n;j++)
 {
   if(pr[l]>pr[j])
 {
   temp1=pr[i];
 pr[l]=pr[j];
  pr[j]=temp1;
  temp1=pt[l];
  pt[l]=pt[j];
  pt[j]=temp1;
 strcpy(temp,pr[l]);
 strcpy(pr[l],pr[j]);
  strcpy(pr[j],temp);
  }
  }
  }
 w[0]=0;
  for(l=1;l<n;l++)
  {
   w[l]=w[l-1]+et[l-1];
   totwt=totwt+w[l];
   }   
avgwt=(float)totwt/n;   
printf("p_name\t p_time\t priority\t w_time\n");
for(l=0;l<n;l++)  
{
   printf(" %s\t %d\t %d\t %d\n" ,p[l],pt[l],pr[l],w[l]);
   }
  printf("total waiting time=%d\n avg waiting time=%f",tot,avg);
  
   }

