import random

num1 = 10
num2 = 50
question = num1 + num2

for index in range(10):
	num1 = int(input("Enter num1:"))
	#num2 = int(input("Enter num2:"))
	question = random.randrange(10)
	if num1 == question:
		print("correct")
			#num1 += 
	if num1 != question:
		print("incorrect")

	
	print(question)
	

