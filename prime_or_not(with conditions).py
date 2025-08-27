num=int(input("Enter Number :"))

if num==2 or num==3 or num==5 or num==7:
    print("Prime Number")
elif num%2==0 or num%3==0 or num%5==0 or num%7==0:
    print("Not Prime")
else:
    print("Prime")

# Enter Number :4
# Not Prime
