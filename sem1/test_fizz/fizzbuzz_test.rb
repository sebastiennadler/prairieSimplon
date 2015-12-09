require 'minitest/autorun'
require './fizzbuzz.rb'

class FizzbuzzTest<Minitest::Unit::TestCase
    def setup
        @fizzbuzz=Fizzbuzz.new
    end 
    def test_donne_1
        assert_equal "1",@fizzbuzz.fb(1)
    end
    def test_donne2
        assert_equal "Fizz",@fizzbuzz.fb(3)
    end
    def test_donne3
        assert_equal "FizzBuzz",@fizzbuzz.fb(15)
    end
    def test_donne4
        assert_equal "11", @fizzbuzz.fb(11)
    end
    def test_donne5
        assert_equal "Fizz",@fizzbuzz.fb(18)
    end
    def test_donne6
        assert_equal "Buzz",@fizzbuzz.fb(20)
    end 
end 
