@extends('layouts.app')

@section('content')

    <div class="container">
        <h3>Adicionando %%MODEL%%</h3>

        @include('errors._check')

        {!! Form::open(['route'=>'%%MODEL_STORE%%']) !!}

            @include('%%MODEL_FORM%%')

            <div class="form-group">
                {!! Form::submit('Criar', ['class' => 'btn btn-primary']) !!}
            </div>

        {!! Form::close() !!}

    </div>

@endsection