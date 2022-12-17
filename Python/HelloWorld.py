print("Hello World")

#how to find prime number, is it prime or not?
n = input("Input your number: ")
int(n)

bool = False

if int(n) > 1:
    for i in range(2, int(n)):
        if (int(n) % i) == 0:
            bool = True
            break

if bool:
    print(int(n), "Is not prime number")
else:
    print(int(n), "Is prime number")
