

#Create an iterator that returns numbers, starting with 1, and each sequence will 
# increase by one (returning 1,2,3,4,5 etc.) and stop after 20 iterations

class MyNumbers:
  def __iter__(self):
    self.a = 1
    return self

  def __next__(self):
    if self.a <= 20:
      x = self.a
      self.a += 1
      return x
    else:
      raise StopIteration

myclass = MyNumbers()
myiter = iter(myclass)

for x in myiter:
  print(x)