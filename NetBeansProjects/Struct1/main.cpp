/* 
 * File:   main.cpp
 * Author: fredaum
 *
 * Created on 29 de agosto de 2019, 21:44
 */

#include <iostream>

using namespace std;

struct data {
    int dia;
    int mes;
    int ano;
};

int main(int argc, char** argv) {
    data hoje;
    hoje.dia = 24;
    hoje.mes = 8;
    hoje.ano = 2019;
    cout << "Hoje é " << hoje.dia << "/" << hoje.mes << "/" << hoje.ano << endl;
    return 0;
}

