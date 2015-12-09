
class Fizzbuzz
 def fb(i)
    str=""
    if (i%3==0)
        str="Fizz"
    end
    if (i%5==0)
        str=str+"Buzz"
    end
    if (i%3!=0&&i%5!=0) 
        str=str+i.to_s
    end
    return str
    end 
end 
fizz=Fizzbuzz.new
puts fizz.fb(3)

=begin fizz=Fizzbuzz.new
print fizz.fb(1)
=end

