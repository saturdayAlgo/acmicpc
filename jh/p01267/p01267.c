#include<stdio.h>

int main(){
        int n, i, y, m, tmp;
       
	y = 0;
	m = 0;

	scanf("%d", &n);
        
	for(i = 0; i < n; i++){
                scanf("%d", &tmp);

                //when youngsik
                y += (tmp / 30) * 10;
                
		if(tmp % 29 > 0)
                        y += 10;


                //when minsik
                m += (tmp / 60) * 15;
                
		if(tmp % 59 > 0)
                        m += 15;
        }

        if(y > m)
                printf("M %d\n", m);

        if(m > y)
                printf("Y %d\n", y);

        if(y == m)
                printf("Y M %d\n", y);

        return 0;
}
