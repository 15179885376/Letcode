#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2019/5/31 0031 15:50
# @Author  : Zzy
# @Site    : 
# @File    : Xuan_Ze_sort.py
# @Software: PyCharm

def text(a):
    temp=0
    i=0
    n=len(a)
    while i<n:
       flag=i
       for j in range(i+1,n):
           if(a[j]<a[flag]):
               flag=j
       if i!=flag:
           a[i],a[flag]=a[flag],a[i]
       i+=1
    return a
if __name__ == '__main__':
    a=[3,12,31,4,2,1,100,23,14,56]
    print(text(a))