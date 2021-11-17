import math

var
    x: array[2, float]
let
    a: float = 1.00
    b: float = -24.00
    c: float = 0.00

func quadraticFormula*(a,b,c: float): array[2, float] =
    
    var root: float
    
    root = (sqrt((b^2) - (4 * a * c)))
    result[0] = ((-b) + root)/(2 * a)

    root = (sqrt((b^2) - (4 * a * c)))
    result[1] = ((-b) - root)/(2 * a)
    

x = quadraticFormula(a,b,c)
echo "x = 0 at ", x[0], " and ", x[1]