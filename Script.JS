var markMass1=78;
var markHeight1=1.68;
var johnMass1=92;
var johnHeight1=1.95;
var markMass2=95;
var markHeight=1.69;
var johnMass2=85;
var johnHeight2=1.76;

var markBMI=markMass1 / markHeight1 **2;
var johnBMI=johnMass1 / johnHeight1 **2;
var markHigherBMI;
if (markBMI > johnBMI)
markHigherBMI=' mark has higher Bmi';
else 
markHigherBMI='john has the higher bmi';

console.log(markHigherBMI);
