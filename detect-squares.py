
import collections


class DetectSquares2(object):

    def __init__(self):
        self.__points = []
        self.__point_counts = collections.defaultdict(int)

    def add(self, point):
        """
        :type point: List[int]
        :rtype: None
        """
        self.__points.append(point)
        self.__point_counts[tuple(point)] += 1

    def count(self, point):
        """
        :type point: List[int]
        :rtype: int
        """
        result = 0
        for x, y in self.__points:
            if not (point[0] != x and point[1] != y and (abs(point[0]-x) == abs(point[1]-y))):
                continue
            result += self.__point_counts[(point[0], y)]*self.__point_counts[(x, point[1])]
        return result