CREATE TABLE IF NOT EXISTS public.quiz (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255),
    type VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public.exam (
    id UUID PRIMARY KEY,
    student_id UUID NOT NULL,
    quiz_id VARCHAR(255) NOT NULL,
    CONSTRAINT fk_exam_quiz FOREIGN KEY (quiz_id) REFERENCES public.quiz (id)
);

CREATE TABLE IF NOT EXISTS public.exam_question (
    id BIGINT NOT NULL,
    is_correct BOOLEAN NOT NULL,
    selected_option VARCHAR(255) NOT NULL,
    exam_id UUID NOT NULL,
    question_id BIGINT NOT NULL,
    CONSTRAINT exam_question_pkey PRIMARY KEY (id),
    CONSTRAINT fk_exam_question_exam FOREIGN KEY (exam_id) REFERENCES public.exam (id),
    CONSTRAINT fk_exam_question_question FOREIGN KEY (question_id) REFERENCES public.question (id)
);
