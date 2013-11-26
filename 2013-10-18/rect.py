class Rect:
    h = 1
    w = 1
    
    def __init__(self, _h, _w):
        self.h = _h
        self.w = _w
        
    def get_area(self):
        return self.h * self.w
        
    def get_pm(self):
        return 2*self.h + 2*self.w
        
sq = Rect(5,10)
print(sq.get_area())
print(sq.get_pm())
