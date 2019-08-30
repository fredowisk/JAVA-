/* 
 * File:   main.cpp
 * Author: fredaum
 *
 * Created on 29 de agosto de 2019, 21:48
 */

#include <iostream>

using namespace std;

struct pessoa {
    string nome;
    int idade;
};

int main(int argc, char** argv) {
    pessoa p;
    cout << "Digite seu nome: ";
    cin  >> p.nome;
    cout << "Quantos anos você tem ? ";
    cin >> p.idade;
    cout << p.nome << ", " << p.idade << " anos";
    return 0;
}

