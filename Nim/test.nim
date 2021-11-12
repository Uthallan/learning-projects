

const
    number: float = 15


var
    x: seq[float] = @[number]


for n in 2..1000:
    var longest = x.len
    x[^1] = float(n)
    while x[^1] != 1:
        var num: float = 0
        if int(x[^1]) mod 2 != 0:
            num = (x[^1]) * float(3) + 1
            x.add num
        else:
            num = (x[^1])/float(2)
            x.add num

        if n >= 3 and (x.len > longest):
            longest = x.len
        else:
            continue
echo x.len


        




