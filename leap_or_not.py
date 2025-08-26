num=int(input("Enter the Year:"))



if num%400==0 or num%4==0 and  not num%100==0 :
    print("leap")

else:
    print("not leap")

# Enter the Year:2024
# leap
