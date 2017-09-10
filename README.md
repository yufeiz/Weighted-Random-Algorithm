# weighted-random-sampling-algorithm
## Getting Started
The algorithm is used for assigning campaign Id and advertisement Id to users.<br/>
There are two campaigns, 3032 and 3033, and each of them has three ads.<br/>
Ads 1001, 1002 and 1003 is belong to Campaign 3032, ads 1004, 1005, 1006 to the other.<br/>
All they have their own weights.<br/>
Campaign 3032's weight : 3033's weight = 3 : 7; <br/>
Ads 1001's weight : 1002's weight : 1003's weight = 1 : 1 : 8;<br/>
Ads 1004's weight : 1005's weight : 1006's weight = 2 : 3 : 4;<br/>
### Prerequisites
```
Java JDK 1.8
```
### Running and Result
1. running code with data provided from project's folder.

2. The result shows user login information, and the occurrence frequency of Campaigns and Ads is consistent with their weights.
