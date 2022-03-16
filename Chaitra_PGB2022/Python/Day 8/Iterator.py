class Iterate:
    def __iter__(self):
        self.a = 1
        return self
    def __next__(self):
        if (self.a <= 20):
            x = self.a
            self.a += 1
            return x
        else:
            raise StopIteration

#creating iterator
obj = Iterate()
i = iter(obj)

print("***Numbers***")
for item in i:
    print(item)

