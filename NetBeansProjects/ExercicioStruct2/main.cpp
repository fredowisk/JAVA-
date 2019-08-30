/* 
 * File:   main.cpp
 * Author: fredaum
 *
 * Created on 30 de agosto de 2019, 11:50
 */

#include <iostream>

using namespace std;


int main(int argc, char** argv) {
    int vetor[10]; int i; int *pt;
    for(i = 0; i<10; i++){
        cout << "Informe o " << i+1 << "º valor: " << endl;
        cin >> vetor[i];
    }
    
    cout << endl << "Impressão normal:" << endl;
    for(i=0; i<10; i++){
        pt = &vetor[i];
        cout << i+1 << "º valor: " << *pt << endl;
    }
    cout << endl << "Impressão inversa:" << endl;
    for(i=9; i>=0; i--){
        pt = &vetor[i];
        cout << i+1 << "º valor: " << *pt << endl;
    }
    
    
    return 0;
}

