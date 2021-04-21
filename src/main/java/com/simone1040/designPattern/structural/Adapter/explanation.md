### Spiegazione [ITA] ###
Le classi Triangle e Square implementano l’interfaccia Shape, la quale espone due soli metodi: perimeter() ed area(). 

Supponiamo ora che ci venga fornita una API con altre figure geometriche già implementate e che vogliamo utilizzare nel 
nostro programma. Chiaramente l’esempio è molto semplice, ma in contesti reali, con librerie molto più complesse, 
disporre di codice già implementato e testato è una situazione abbastanza comune ed in generale  reinventare la ruota  
non è una strada praticabile, per motivi di tempo e costi.

Sfortunatamente la nuova API utilizza l’interfaccia GeometricShape che definisce gli stessi metodi di Shape, perimeter() 
e area(), ma poiché l’ereditarietà in java è di tipo  strutturale  (o sub-typing), le due interfacce sono comunque differenti. 
Quindi se volessimo utilizzare nel nostro client la classe Rectangle che implementa GeometricShape, 
si presenterebbe una incompatibilità evidenziata dal compilatore nel momento in cui tentiamo di eseguire il codice seguente:

```
public static void main(String[] args) {
    ....
    calculator.addShape( new Rectangle() );
    ....
}
```

### Object Adapter Pattern ###
Un primo approccio per implementare il pattern è quello di utilizzare la composition, 
ovvero di includere l’oggetto sorgente nell’implementazione dell’adapter. 
In altri termini la classe Adapter implementa l’interfaccia Target (ovvero Shape del nostro esempio) e 
fa riferimento ad un oggetto di tipo Adaptee (ovvero GeometricShape del nostro esempio). 
Quindi implementa tutti i metodi richiesti da Target eseguendo la conversione necessaria per soddisfare i requisiti 
di tale interfaccia, utilizzando i metodi esposti daAdaptee.

### Class Adapter Pattern ###

Un secondo approccio consiste nell’utilizzare l’ereditarietà, estendendo la classe dell’oggetto che si intende adattare, 
in una nuova classe che implementa l’interfaccia Target. 
Come è evidente tale approccio, diversamente dal precedente, 
richiede lo sviluppo di una classe distinta per ogni oggetto che implementa l’interfaccia Adaptee.