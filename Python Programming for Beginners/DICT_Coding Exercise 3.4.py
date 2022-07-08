class Customers:
    greetings = "Welcome to the Coffee Palace"

c_1 = Customers()

c_1.name = "jerry"
c_1.beverage = "Caramel Macchiato"
c_1.food = "Glazed doughnut"
c_1.total = 230


c_2 = Customers()
c_2.name = "Samirah"
c_2.beverage = "Ice caffe latte"
c_2.food = "Cinnamon Roll"
c_2.total = 225

print(Customers.greetings)
print(c_1.food)
print(c_2.beverage)