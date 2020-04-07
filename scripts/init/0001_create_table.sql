CREATE TABLE IF NOT EXISTS public.test_table (
    id INTEGER PRIMARY KEY,
    name VARCHAR NOT NULL,
    address VARCHAR (50),
    created_at TIMESTAMP NOT NULL
);