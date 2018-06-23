package com.st.HashMap;

public class Key {
		String key;
		Key(String key)
		{
			this.key = key;
		}

		@Override
		public int hashCode()
		{
			//int hash = (int)key.charAt(0);
			System.out.println("hashCode for key: "
							+ key +" = "+ key.hashCode());
			return key.hashCode();
		}

		@Override
		public boolean equals(Object obj)
		{
			return key.equals(((Key)obj).key);
		}
	}

