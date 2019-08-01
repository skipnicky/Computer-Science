package comp1406a3;

public class TestFutureDate{
	//public static void main(String[] args){FutureDateTestCase[] idc =makeTestCases();}
	/** Generate black-box test cases for the futureDate method (in the Date class).
		* @return an array of test cases for the futureDate method (in the Date class).
		*/
	public static FutureDateTestCase[] makeTestCases(){
	int[][] tests = {
			{2000,03,14,7},
			{1970,01,01,5000},
			{2992,11,7,1779719},
			{3338,6,24,330},
			{2019,02,28,1},
			{1961,12,30,3},
			{1850,9,29,2},
			{2016,02,28,1},
			{2019,01,01,0},
			//random but changed
			{4444,2,28,3},
			{4444,2,28,0},
			//line of random
			{4744,4,26,16},
			{5744,11,11,24},
			{3971,4,30,9},

			{2880,11,19,27},
			{2103,7,28,16},

			{4030,10,27,24},
			{1876,3,27,9},
			{3919,4,17,19},
			{3270,8,29,8},
			{3577,4,17,130},
			{4912,3,22,489},

			{5599,10,6,343},
			{5007,10,17,270},
			{2045,6,4,257},
			{5863,12,28,242},
			{4035,7,3,133},
			{5090,10,27,245},

			//BIG random
			{5196,12,11,196},
			{1926,6,15,470},
			{4147,12,16,431},
			{3514,4,26,264},
			{2896,9,1,484},
			{3129,8,9,468},
			{4728,8,9,195},
			{4352,3,23,68},
			{2756,6,22,401},
			{2043,12,21,13},
			{4177,2,27,97},
			{5647,1,27,260},
			{4656,11,3,217},
			{2951,4,29,58},
			{2789,12,25,195},
			{5037,11,9,18},
			{2761,1,11,423},
			{1950,4,10,459},
			{2187,2,8,124},
			{4178,7,4,100},
			{4905,7,18,95},
			{4718,8,24,288},
			{4046,5,29,300},
			{3258,5,1,484},
			{2006,5,26,91},
			{4840,8,26,72},
			{3393,5,31,446},
			{5958,4,15,99},
			{2954,1,31,128},
			{2853,3,20,285},
			{2758,3,8,5},
			{3792,4,15,22},
			{5752,6,11,29},
			{2655,3,20,12},
			{1753,7,23,18},
			{3009,1,13,5},
			{4179,8,17,3},
			{4712,6,20,1},
			{3911,5,22,2},
			{1988,6,11,12},
			{5961,12,13,24},
			{4581,6,17,0},
			{2440,10,20,21},
			{4599,6,18,30},
			{1758,2,27,18},
			{3697,6,14,12},
			{4775,12,31,12},
			{5596,5,20,26},
			{4717,8,11,1},
			{2040,4,25,9},
			{2607,1,20,30},
			{2600,6,10,16},
			{5869,4,22,28},
			{5762,10,3,3},
			{2556,9,22,18},
			{4187,7,17,22},
			{4892,4,9,12},
			{3933,7,14,4},
			{4669,11,27,23},
			{2909,9,4,14},
			{3455,6,2,8},
			{1879,11,24,10},
			{5998,1,30,27},
			{3422,2,1,16},
			{5155,4,4,3},
			{4335,5,12,30},
			{2344,5,10,11},
			{3380,9,27,12},
			{5665,12,23,8},
			{5583,6,6,15},
			{5963,4,27,13},
			{4517,4,17,0},
			{4437,8,20,5},
			{3145,2,12,9},
			{2436,5,15,20},
			{2249,5,4,17},
			{4572,4,1,21},
			{4115,2,9,14},
			{3678,2,18,3},
			{2945,9,9,19},
			{3490,7,20,9},
			{3393,2,3,2},
			{5977,3,9,10},
			{2208,10,1,20},
			{3274,8,16,10},
			{5953,2,4,25},
			{5994,9,9,30},
			{5107,3,17,20},
			{3128,4,23,26},
			{2654,3,28,17},
			{2631,12,25,2},
			{3931,8,9,27},
			{3091,7,2,8},
			{4927,4,3,1},
			{4118,5,15,15},
			{2894,5,6,18},
			{5647,5,27,1},
			{5528,6,25,19},
			{2703,7,17,29},
			{5404,6,27,0},
		};
	int[][] answers = {
		{2000,3,21},
		{1983,9,10},
		{7865,7,23},
		{3339,5,20},
		{2019,3,1},
		{1962,1,2},
		{1850,10,1},
		{2016,2,29},
		{2019,1,1},
		{4444,3,2},
		{4444,2,28},
		{4744,5,12},
		{5744,12,5},
		{3971,5,9},
		{2880,12,16},
		{2103,8,13},
		{4030,11,20},
		{1876,4,5},
		{3919,5,6},
		{3270,9,6},
		{3577,8,25},
		{4913,7,24},
		{5600,9,13},
		{5008,7,13},
		{2046,2,16},
		{5864,8,26},
		{4035,11,13},
		{5091,6,29},
		{5197,6,25},
		{1927,9,28},
		{4149,2,19},
		{3515,1,15},
		{2897,12,29},
		{3130,11,20},
		{4729,2,20},
		{4352,5,30},
		{2757,7,28},
		{2044,1,3},
		{4177,6,4},
		{5647,10,14},
		{4657,6,8},
		{2951,6,26},
		{2790,7,8},
		{5037,11,27},
		{2762,3,10},
		{1951,7,13},
		{2187,6,12},
		{4178,10,12},
		{4905,10,21},
		{4719,6,8},
		{4047,3,25},
		{3259,8,28},
		{2006,8,25},
		{4840,11,6},
		{3394,8,20},
		{5958,7,23},
		{2954,6,8},
		{2853,12,30},
		{2758,3,13},
		{3792,5,7},
		{5752,7,10},
		{2655,4,1},
		{1753,8,10},
		{3009,1,18},
		{4179,8,20},
		{4712,6,21},
		{3911,5,24},
		{1988,6,23},
		{5962,1,6},
		{4581,6,17},
		{2440,11,10},
		{4599,7,18},
		{1758,3,17},
		{3697,6,26},
		{4776,1,12},
		{5596,6,15},
		{4717,8,12},
		{2040,5,4},
		{2607,2,19},
		{2600,6,26},
		{5869,5,20},
		{5762,10,6},
		{2556,10,10},
		{4187,8,8},
		{4892,4,21},
		{3933,7,18},
		{4669,12,20},
		{2909,9,18},
		{3455,6,10},
		{1879,12,4},
		{5998,2,26},
		{3422,2,17},
		{5155,4,7},
		{4335,6,11},
		{2344,5,21},
		{3380,10,9},
		{5665,12,31},
		{5583,6,21},
		{5963,5,10},
		{4517,4,17},
		{4437,8,25},
		{3145,2,21},
		{2436,6,4},
		{2249,5,21},
		{4572,4,22},
		{4115,2,23},
		{3678,2,21},
		{2945,9,28},
		{3490,7,29},
		{3393,2,5},
		{5977,3,19},
		{2208,10,21},
		{3274,8,26},
		{5953,3,1},
		{5994,10,9},
		{5107,4,6},
		{3128,5,19},
		{2654,4,14},
		{2631,12,27},
		{3931,9,5},
		{3091,7,10},
		{4927,4,4},
		{4118,5,30},
		{2894,5,24},
		{5647,5,28},
		{5528,7,14},
		{2703,8,15},
		{5404,6,27},
	};
		FutureDateTestCase[] cases = new FutureDateTestCase[tests.length];
		for(int i=0;i<tests.length;i++){
			Date date = new Date(tests[i][0],tests[i][1],tests[i][2]);
			int daysInFuture = tests[i][3];
			Date expected;
		//	expected = date.futureDate(daysInFuture);
		//	System.out.println("{"+expected.getYear()+","+expected.getMonth()+","+expected.getDay()+"},");
			expected = new Date(answers[i][0],answers[i][1],answers[i][2]);
			cases[i] = new FutureDateTestCase(date,daysInFuture,expected);
		}

		//FutureDateTestCase[] cases = {testCase};
	/*	for(FutureDateTestCase f: cases){
			System.out.println(f.getNow()+"+"+f.getDays()+"->"+f.getExpected());
		}*/
		/*
		Date date = new Date(2000,03,14);
		int daysInFuture = 7;

		Date expected = date.notFutureDate(daysInFuture);
		expected = new Date(expected.getYear(),expected.getMonth(),expected.getDay());
		date = new Date(2000,03,14);
		//System.out.println("WAIT A SECOND: "+date+"->"+expected+"|"+new Date(2000,03,21));
		//expected = new Date(2000,03,21);
		FutureDateTestCase testCase = new FutureDateTestCase(date,daysInFuture,expected);

		FutureDateTestCase[] cases = {testCase};
		*/
		return cases;
	}
}