#include <stdio.h>
#include <stdlib.h>

void win() {
    FILE* in;
    char flag[128];
    in = fopen("flag.txt", "rt");
    if (!in) {
        puts("flag not found");
        exit(1);
    }
    fscanf(in, "%127s", flag);
    fclose(in);
    printf("FLAG: %s\n", flag);
    getchar();
    exit(0);
}

void vuln() {
    size_t n;
    printf("Enter number of players:\n");
    if (scanf("%lu", &n) != 1) {
        puts("bad input");
        exit(1);
    }


    char name[64];
    printf("Enter your name:\n");
    scanf("%s", name);

    printf("Thanks %s\n", name);
}

int main() {
    setbuf(stdin, NULL);
    setbuf(stdout, NULL);
    vuln();
    return 0;
}
