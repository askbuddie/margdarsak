# PySpark Roadmap

## History of Big Data and Distributed Programing

We created software applications and deployed them on computers. These applications needed to do a lot of things including and not limited to storing and processing data.
Over a period of time, the data volume kept growing. Hence, the requirement for storage and computation power was also increasing. This need was being fulfilled by the rapid advancement in storage and compute hardware.
Our applications automatically started storing more and more data and kept becoming faster and faster by simply upgrading the hardware.
However, the advent and rapid adoption of the Internet disrupted this perfect harmony. The scope and the reach of the software applications started to expand across the geographic boundaries and covered the entire planet.
As a result, the data began growing and evolving exponentially. It wasn't possible and practical for hardware technology to catch up with this growth and disruption.
But we needed a solution. Google was not only the first to realize this problem, but also the first to develop a viable solution and establish a commercially successful business around it.

At a high level,
Google had four main problems to solve.

- Data collections and data ingestion problems.

- Store and manage hundreds of petabytes of data.

- Computation power for processing those massive volumes.

- Organize and store the outcome of the processing.

Google successfully solved all the above problems, and they were generous enough to reveal their solution to the rest of the world in a series of white papers.
The first whitepaper was published by Google in the year 2003, and it talked about solving the Data Storage and Management problem. They termed the solution as Google File System (GFS).
The second whitepaper was published by Google in the year 2004 and talked about the Data Processing and Transformation problem. They termed it as MapReduce (MR) programming model.

Open-source community formed the basis for the design and the development of similar open-source implementation __The Hadoop__.

- The GFS is implemented as a Hadoop Distributed File System -> HDFS.
- Google MR is applied as the Hadoop MapReduce programming framework.

Hadoop grabbed immense attention and popularity among the organizations and professionals.

Since then, there are many other solutions developed over the Hadoop platform and open-sourced by various organizations.
Some of the most widely adopted systems were Pig, Hive, and __finally, the Apache Spark__.
That's all about History.

## What is PySpark

PySpark is a Python-based tool developed by the Apache Spark Community for use with Spark.It enables Python to work with RDDs (Resilient Distributed Datasets).
It also includes PySpark Shell, which connects Python APIs to the Spark core in order to launch Spark Context.

## Why is it so popular?

There are three main reasons-

- Abstraction : Spark will abstract away the fact that you are coding to execute your program on a cluster of computers. In the best-case scenario, you will be working with tables and using SQL queries.
                In the worst-case scenario, you will be working with RDDs or data frames.
- Unified Platform : Batch Processing, Stream Processing, Structured and semistructured data handling, Graph processing, machine learning, and deep learning.
All of this in a single framework using your favorite programming language. You can mix and match them to solve many sophisticated requirements.
- Ease of use : If you compare it with old Hadoop and MapReduce code, Spark code is much shorter, simple, easy to read, and understand. You also have a growing and evolving ecosystem to offer ready to use libraries, algorithms, and integration with a wide variety of other systems.

## Skills required for PySpark learning

- Python : Learn Python to a good usage level, you wouldn’t need anything too fancy, but you would need to be proficient.
- SQL : Learn SQL and/or Pandas, and in general how to work with data - joins, merges, concatenation etc.
        PySpark reuses a lot of the syntax of both. For lower level stuff, it’s useful to understand Pandas and for higher level stuff it’s useful to write SQL (you can actually run SQL queries directly on Spark).

## Tools required

### Local Machine

- Java
- Python / Anaconda
- Pyspark
- Winutils
- For installtion process [click](https://www.javatpoint.com/pyspark-installation#:~:text=PySpark%20requires%20Java%20version%201.8.0%20or%20the%20above,sure%20PySpark%20can%20work%20with%20these%20two%20components.) here.

### Real time cluster

- (Paid) For real time cluster you can opt for AWS Databricks, Azure Databricks, or Google cloud
- (Free) Databricks community cloud

## Pyspark basics

### Pyspark modules and initialization

- Spark Session
- Spark Context
- SQLContext
- RDD
- Parallelize
- repartiton() and coalesce()
- Broadcast variables
- Accumulator

### PySpark dataframe basics

- Dataframe creation
- RDD to dataframe
- Dataframe to Pandas
- show()
- StructType() and StructField()
- select()
- collect()
- withColumn()
- withCoulmnRenamed()
- where() & filter()
- drop()
- orderBy() & sort()
- groupBy()
- join()
- union() & unionAll()
- UDF - User defined function
- map()
- flatmap()
- foreach()
- fillna() & fill()
- pivot()
- partitionBy()

### PySparks SQL basics

- Aggregate functions
- Windows funtions
- Date and Timestamp functions
- Json functions

### PySpark data sources basics

- Read & Write text file
- Read & Write CSV file
- Read & Write Parquet file
- Read & Write Json file

### PySpark built-in functions

- when()
- expr()
- lit()
- split()
- concat()
- substring()
- date_format()
- array()
- create_map()
- row_number()
- rank()

## Project Available on internet that can be used for learning

- Watson Studio project by [IBM](https://developer.ibm.com/tutorials/getting-started-with-pyspark/)
- PySpark Tutorial for Beginners by [Guru99](https://www.guru99.com/pyspark-tutorial.html)
- Towards Data Science by [Henok Yemam](https://towardsdatascience.com/a-project-driven-approach-to-learning-pyspark-4533c85f52b3)

**Happy Learning**
