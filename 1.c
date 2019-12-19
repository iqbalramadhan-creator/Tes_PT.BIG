#include<stdio.h>
int main () {
    FILE *f;
    char str[20];
    int i;

    printf("Masukan string yg ditulis ke file : ");
    gets(str);
    f = fopen("#", "a+");
    if(f==NULL) {
        printf("Error : File tidak bisa dibuka. \n");
        return 1; }
    else {
        printf("Isi file : \n");
        while (!feof(f)) {
            fgets(str,sizeof(str),f);
            printf("%s",str);
        }
        fclose(f);
        return 0;
    }
}
