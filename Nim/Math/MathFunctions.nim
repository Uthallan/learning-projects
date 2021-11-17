import math

var 
    endPoints: array = [-1.00,2.00]

    # First find critical points where tangent line == 0
    # or undefined. so f'(x) == 0
    criticalPoints: array[2, float]
#[
let
    a: float = 2.00
    b: float = -66.00
    c: float = 168.00
criticalPoints = quadraticFormula(a,b,c)
]#
criticalPoints = [2.00,2.00]

# f(x)
func f(x: float): float =
    sqrt( 4 - (x^2) )

# f'(x)
func fPrime(x: float): float =
    1 / ( 2 * sqrt( 4 - (x^2) ) )




# Evaluate all critical points and end points with f(x)
var pointsToCheck: seq[float] = @[]


for n in endPoints:
    pointsToCheck.add(n)
for n in criticalPoints:
    

    if n <= endPoints[0]:
        continue
    elif n >= endPoints[1]:
        continue
    elif endPoints[0] == endPoints[1]:
        continue
    elif n > endPoints[0] and n < endPoints[1]:
        pointsToCheck.add(n)

echo ""


for n in pointsToCheck:
    echo "f(", n,") = ", f(n)
